public class InsertanElementInArray {
    public static void main(String args[]){
        int [] arr = {2,4,6,8,7,9,1,};
        int pos= 6;
        int element = 100;
        for( int i= arr.length-1; i>pos-1; i--){
            arr[i]= arr[i-1];
        }
        arr[pos-1]= element;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        }
    }
    
