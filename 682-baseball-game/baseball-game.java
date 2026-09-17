class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> sack = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                sack.pop();
            }
            else if (op.equals("D")) {
                sack.push(2 * sack.peek());
            }
            else if (op.equals("+")) {
                int last = sack.pop();
                int secondLast = sack.peek();

                sack.push(last);
                sack.push(last + secondLast);
            }
            else {
                sack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        while (!sack.empty()) {
            sum += sack.pop();
        }

        return sum;
    }
}