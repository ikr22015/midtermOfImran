package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class StockAndLinkedList {

    public static void main(String args[]) {

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

        String data = null;

        //Storing all words into Stack
        try {
            //Here Iv'e peeked data by BufferReader.
            BufferedReader br = new BufferedReader(new FileReader(textFile));
            data = br.readLine();

            //Iv'e  split whole data to each words.
            String[] words = data.split(" ");

            //Pushing all words into Stack
            Stack st = new Stack();
            for (int i = 0; i < words.length; i++){
                st.push(words[i]);
            }
            //To see all pushed words, you can uncomment println bellow
            //System.out.println(st);

        }catch (Exception e){
            e.printStackTrace();
        }/*********************Word storing END into Stack***************/

        //Storing all words into LinkedList
        try{
            //Here Iv'e peeked data by BufferReader.
            BufferedReader br = new BufferedReader(new FileReader(textFile));
            data = br.readLine();

            //Iv'e  split whole data to each words.
            String[] words = data.split(" ");

            //Adding all words into LinkedList
            LinkedList<String> st =new LinkedList<String>();
            for (int i = 0; i < words.length; i++){
                st.add(words[i]);
            }

            Iterator<String> itr = st.iterator();

            while (itr.hasNext()){
                System.out.println(itr.next());
            }

        }catch (Exception e){
            e.printStackTrace();
        }/********************* END Word storing and retrieving as FIFO from LinkedList***************/




    }
}
