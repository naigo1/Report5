class Report5{
    public static void main(String[] args){
        String str = null;
        try{
        System.out.println(str.length());
        }catch (NullPointerException e) {
            //NullPointerExceptionが起きたときの処理
            System.out.println("NullPointerException発生！");
            System.out.println(e.getMessage());
        }
    }
}