public class stackPrice 
{
    // calculating maximum price of stock
    public static int maxStockPrice(int[] prices) 
    {
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) 
            {
            if (price < minPrice) 
            {
                minPrice = price;
            } 
            else if (price - minPrice > maxPrice) 
            {
                maxPrice = price - minPrice;
            }
        }

        return maxPrice;
    }
}
