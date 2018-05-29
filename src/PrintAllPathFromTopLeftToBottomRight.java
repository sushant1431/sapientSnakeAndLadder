import java.util.Arrays;

public class PrintAllPathFromTopLeftToBottomRight {


    public void print(String arr[][],int row, int col,String result[],int pos){
        if(row == arr.length-1 && col == arr[0].length-1){
            result[pos] = arr[row][col];
            System.out.println(Arrays.toString(result));
            return;
        }
        if(row >= arr.length || col >= arr[0].length){
            return;
        }
        
        result[pos] = arr[row][col];
        print(arr,row,col+1,result,pos+1);
        print(arr,row+1,col,result,pos+1);
    }
    
    public static void main(String args[]){
        PrintAllPathFromTopLeftToBottomRight pam = new PrintAllPathFromTopLeftToBottomRight();
        String arr[][] = {{"a","b"},{"c","d"},{"e","f"}};
        String result[] = new String[arr.length + arr[0].length-1];
        pam.print(arr, 0, 0, result,0);
    }
}