class holo{
    public static void main(String[] args) {
        int i=0,j=0;
        for(i=1;i<=5;i++){
            for( j=1;j<=3;j++){
                if(i==1 || i==5 || j==1 || j==3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}