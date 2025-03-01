class firstsecondsmallest{
    public static void main(String[] args) {
        int a[]={4,2,6,9,1};
    firstsecondmin(a);
    }
    public static void firstsecondmin(int [] a){
        int firstmin=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<firstmin){
                secondmin=firstmin;
                firstmin=a[i];
            }
            else if(a[i]<secondmin&&a[i]!=firstmin){
                secondmin=a[i];
            }
        }
        if(secondmin==Integer.MAX_VALUE){
            System.out.println("no second min");
        }else {
        System.out.println("secondsmallest="+secondmin);
        System.out.println("firstlargest="+firstmin);
        }
    }
}