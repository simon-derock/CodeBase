#!/bin/bash

OUTPUT_FILE="${1:-amfi_nav_data.tsv}"
URL="https://www.amfiindia.com/spages/NAVAll.txt"

echo "Fetching NAV data from $URL..."

TEMP_FILE=$(mktemp)

if ! curl -s "$URL" > "$TEMP_FILE"; then
    echo "Error: Failed to download data from $URL"
    rm "$TEMP_FILE"
    exit 1
fi

echo "Processing data..."

echo -e "Scheme Name\tNAV" > "$OUTPUT_FILE"

awk -F';' '
    NF >= 5 {
        if ($5 ~ /^[0-9]+(\.[0-9]+)?$/) {
            gsub(/^[ \t]+|[ \t]+$/, "", $4);
            gsub(/^[ \t]+|[ \t]+$/, "", $5);
            printf "%s\t%s\n", $4, $5;
        }
    }
' "$TEMP_FILE" >> "$OUTPUT_FILE"

rm "$TEMP_FILE"

ENTRIES=$(wc -l < "$OUTPUT_FILE")
ENTRIES=$((ENTRIES - 1))

echo "Done! Extracted $ENTRIES scheme entries to $OUTPUT_FILE"
