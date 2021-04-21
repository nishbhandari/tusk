Public Class CustomException{

  Public static void main(String args[])
    
    int available_bal = 5000;
    int entered_bal   = 7000;
  
    try{
    if(entered_bal>available_bal) {
      throw MyException("Test")
    }else{
      System.out.println("db operations...");    
    }catch (Exception e){
        System.out.println("Insufficiant Balance..");  
      }
         
    
    }  



}


Class MyException Extends Exception{

   MyException(String s){
     Super();   
   }



}
