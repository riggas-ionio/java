import json

with open('stocks.json') as json_file:
    data = json.load(json_file)
    for stock in data:
        #print (stock['name'], '(', stock['symbol'], ') $', stock['currentValue'])
        print stock['name'], '(', stock['symbol'], ') $', stock['currentValue']
