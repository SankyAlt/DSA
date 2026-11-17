class StockSpanner {
    private Deque<int[]> sack;
    public StockSpanner() {
        sack = new ArrayDeque<>();
    }
    

    public int next(int price) {
        int span = 1;
        while(!sack.isEmpty() && sack.peek()[0] <=price){
            span += sack.peek()[1];
            sack.pop();

        }
        sack.push(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */