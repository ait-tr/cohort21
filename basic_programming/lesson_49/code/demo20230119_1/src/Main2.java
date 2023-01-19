public class Main2 {
    public static void main(String[] args) {
        doSmth(0);


        try {
            doSmth2(0);
        } catch (MyCheckedException e) {
            System.out.println("MyChecked exception is handled");
        } catch (RuntimeException e){
            System.out.println("Runtime");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Unknown problem");
        } finally {

        }

    }




    public static void doSmth(int index){ //Unchecked
        if (index<0) {
            throw new MyUncheckedException();
        }
        System.out.println("Все ок!");
    }

    public static void doSmth2(int index) throws MyCheckedException, Exception { //checked
        if (index==0) throw new MyUncheckedException();
        if (index<0) {
            throw new MyCheckedException();
        }
        System.out.println("Все ок!");
        if(index==666) throw new Exception("Ужас!!!!!");
    }

}