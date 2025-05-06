class MatrixAddition {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;
        a[2][0] = 7;
        a[2][1] = 8;
        a[2][2] = 9;

        b[0][0] = 10;
        b[0][1] = 11;
        b[0][2] = 12;
        b[1][0] = 13;
        b[1][1] = 14;
        b[1][2] = 15;
        b[2][0] = 16;
        b[2][1] = 17;
        b[2][2] = 18;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] + " ");
            }
            System.out.println( );
        }
    }

}
