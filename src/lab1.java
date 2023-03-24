public class lab1 {
    public static void main(String[] args) {
        long i, j;
        // встановлення константи С та суми S
        double S=0;
        int C=0, a=1, n=5, b=1, m=5;

        if ((a>n)||(b>m)){ // перевірка границь сумування
            System.out.print("Помилка в границях сумування");
            return;
        }
        for (i=a; i<=n; i++){
            if (i+C==0) { // перевірка на умову ділення на 0
                System.out.println("Ділення на 0");
                return;
            }
            for (j=b; j<=m; j++){
                S += (double) (i/j)/(i+C); // виведення результату
            }
        }
        System.out.println("S = " + S);
    }
}