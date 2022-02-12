import java.io.*;

class NumeroFile {
  public static void main(String[] args)
  throws IOException {
    int v[];	// viene creata la variabile ma non il vettore
    int n, i;
    FileReader f;
    BufferedReader b;
    String s;

    f=new FileReader("java/example-1-input.txt");
    b=new BufferedReader(f);

// lettura numero elementi e creazione array
   s=b.readLine();
   n=Integer.parseInt(s);
   v=new int[n];

// lettura array da file
    for(i=0; i< v.length; i++) {
      s=b.readLine();
      if(s==null)
        break;
      v[i]=Integer.parseInt(s);
    }

// stampa dell'array
    for(i=0; i< v.length; i++) {
      System.out.println(v[i]);
    }

  }
}