/*+
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drew
 */
public class largestgap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Given an unsorted array of length N, and we have to find the largest gap between any two elements of the array. 
        //In simple words, find max(|Ai-Aj|) where 1 ≤ i ≤ N and 1 ≤ j ≤ N.
        
        int[] Input = {1,2,3,4};
        int Array_Length = 4;
        
        int Result;
        int Temporary_Result = 0;
        int Temporary_Result_Two = 0;
        
        for(int j = 0; j < Array_Length; j++)
        {
            Temporary_Result = abs(Array[j]-Array[j+1]);
            Temporary_Result_Two = abs(Array[j+1]-Array[j+2]);
            if(Temporary_Result < Temporary_Result_Two)
            {
                Temporary_Result = Temporary_Result_Two;
            }
            
    }
    System.out.println(Temporary_Result);
}
