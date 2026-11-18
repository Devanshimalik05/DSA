public class Binarysearch{
     public static int Binarysearch(int marks[], int key){
        int start=0; int end=marks.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(marks[mid]==key){
                return mid;
            }
            if(marks[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
  public static void main(String[] args) {
        int marks[]={10,20,23,30};
        int key=23;
        System.out.println("The index is at"+Binarysearch(marks, key));
    }
    }

