import java.util.*;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        if (numRows == 1) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(Arrays.asList(1));
            return res;
        }
        List<List<Integer>> prevRow = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }
        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(
                i,
                prevRow.get(numRows - 2).get(i - 1)
              + prevRow.get(numRows - 2).get(i)
            );
        }
        prevRow.add(newRow);
        return prevRow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();
        PascalTriangle sol = new PascalTriangle();
        List<List<Integer>> result = sol.generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
   
}
