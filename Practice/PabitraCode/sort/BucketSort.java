import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void bucketsort(float arr[]){
        //Buckets
        int n=arr.length;
        //int a[]=new int[5];
        ArrayList<Float>[] bucket=new ArrayList[n];
        for(int i=0;i<n;i++){
            bucket[i]=new ArrayList<Float>();
        }
        //add elements into our buckets
        for(int i=0;i<n;i++){
            int bucketIndex=(int)arr[i]*n;
            bucket[bucketIndex].add(arr[i]);
        }
        //sort each bucket indevidually
        for(int i=0;i<bucket.length;i++){
            Collections.sort(bucket[i]);
        }
        //Merge all buckets to get final sorted array
        int index=0;
        for(int i=0;i<bucket.length;i++){
            ArrayList<Float> currBucket=bucket[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++]=currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float arr[]={0.5f,0.4f,0.3f,0.1f};
        bucketsort(arr);
        for(float val:arr){
            System.out.print(val+" ");
        }
    }
}
