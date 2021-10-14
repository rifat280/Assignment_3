public class SeriesPrinter {

    void printSeries(int n){

        for (int i = 0; i<=n; i++){

            if(i<n){
                System.out.print(i+" ");
            }else{
                System.out.println(i);
            }
        }
    }

    void printSeries(int startIndex, int endIndex){
        for (int i = startIndex; i<=endIndex; i++){

            if(i<endIndex){
                System.out.print(i+" ");
            }else{
                System.out.println(i);
            }
        }
    }

    void printSeries(int startIndex, int endIndex, int interval){
        for (int i = startIndex; i<=endIndex; i+=interval){

            if(i<endIndex){
                System.out.print(i+" ");
            }else{
                System.out.println(i);
            }
        }
    }
}
