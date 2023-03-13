package exception2;

public class TryCatch {
    public static void main(String[] args) {
        try {
            String line = null;
            System.out.println(line.length());
            String line1 = "";
            System.out.println(line1.charAt(0));
            String line2 = "abc";
            System.out.println(Integer.parseInt(line2));
            /*Interger将字符串转换为整数类型，要求参数必须是整数且可以有一个可选的正负号*/
        }catch (NullPointerException e ){
            System.out.println("空指针异常处理完成");
        }catch (IndexOutOfBoundsException e) {
            System.out.println("下标越界处理完成");
        }catch (NumberFormatException e){
            System.out.println("字符格式错误处理完成");
        }
        /*catch (NullPointerException | IndexOutOfBoundsException | NumberFormatException e){
            System.out.println("多种异常，处理方式相同");
        }*/
        catch (Exception e){
            System.out.println("只要是异常都处理完成");
        }finally {
            System.out.println("用于流处理关闭");

        }
        System.out.println("异常处理完成");






    }
}
