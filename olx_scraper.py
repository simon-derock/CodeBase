import requests
from bs4 import BeautifulSoup
import json
import csv
from datetime import datetime

def scrape_olx_car_covers(page_count=1):
    """
    Scrape car cover listings from OLX India.
    
    Args:
        page_count (int): Number of pages to scrape. Default is 1.
        
    Returns:
        list: List of dictionaries containing car cover listing information.
    """
    base_url = "https://www.olx.in/items/q-car-cover"
    headers = {
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"
    }
    
    all_results = []
    
    for page in range(1, page_count + 1):
        url = f"{base_url}?page={page}"
        print(f"Scraping page {page}...")
        
        try:
            response = requests.get(url, headers=headers)
            response.raise_for_status()  # Raise exception for 4XX/5XX responses
            
            soup = BeautifulSoup(response.content, 'html.parser')
            
            # Find all listing cards
            # Note: These selectors might need to be updated if OLX changes their website structure
            listings = soup.select('li.EIR5N')
            
            for listing in listings:
                try:
                    # Extract details
                    title_elem = listing.select_one('[data-aut-id="itemTitle"]')
                    price_elem = listing.select_one('[data-aut-id="itemPrice"]')
                    location_elem = listing.select_one('[data-aut-id="item-location"]')
                    date_elem = listing.select_one('[data-aut-id="item-date"]')
                    link_elem = listing.select_one('a')
                    
                    result = {
                        'title': title_elem.text.strip() if title_elem else 'N/A',
                        'price': price_elem.text.strip() if price_elem else 'N/A',
                        'location': location_elem.text.strip() if location_elem else 'N/A',
                        'posted_date': date_elem.text.strip() if date_elem else 'N/A',
                        'url': 'https://www.olx.in' + link_elem['href'] if link_elem and 'href' in link_elem.attrs else 'N/A'
                    }
                    
                    all_results.append(result)
                    
                except Exception as e:
                    print(f"Error parsing listing: {e}")
                    continue
            
        except Exception as e:
            print(f"Error fetching page {page}: {e}")
            continue
            
        print(f"Found {len(all_results)} results so far...")
    
    return all_results

def save_to_json(data, filename):
    """Save data to a JSON file."""
    with open(filename, 'w', encoding='utf-8') as f:
        json.dump(data, f, indent=4, ensure_ascii=False)
    print(f"Data saved to {filename}")

def save_to_csv(data, filename):
    """Save data to a CSV file."""
    if not data:
        print("No data to save.")
        return
        
    with open(filename, 'w', encoding='utf-8', newline='') as f:
        writer = csv.DictWriter(f, fieldnames=data[0].keys())
        writer.writeheader()
        writer.writerows(data)
    print(f"Data saved to {filename}")

def main():
    # Get user input for number of pages to scrape
    try:
        pages = int(input("Enter number of pages to scrape (default 1): ") or "1")
    except ValueError:
        print("Invalid input. Using default value of 1 page.")
        pages = 1
    
    # Get user input for output format
    output_format = input("Choose output format (json or csv, default json): ").lower() or "json"
    
    # Create timestamped filename
    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    filename = f"olx_car_covers_{timestamp}.{output_format}"
    
    # Scrape the data
    print("Starting OLX car cover search scraper...")
    results = scrape_olx_car_covers(pages)
    
    # Save the data in the requested format
    if output_format == "csv":
        save_to_csv(results, filename)
    else:
        save_to_json(results, filename)
    
    print(f"Scraping complete! Found {len(results)} car cover listings.")

if __name__ == "__main__":
    main()
