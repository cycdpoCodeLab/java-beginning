package tech.cycjimmy.beginning;

public class ExceptionTest {
    /**
     * test1() 抛出自定义异常
     * test2() 调用test1(),捕获自定义异常，并包装成运行时异常,继续抛出
     * main 方法中, 调用test2(), 尝试捕获test2()方法抛出的异常
     *
     * @param args
     */
    public static void main(String[] args) {

        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.test2();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private void test1() throws CustomException {
        throw new CustomException("自定义异常");
    }

    private void test2() {
        try {
            test1();
        } catch (CustomException e) {
            //e.printStackTrace();

            RuntimeException newExc = new RuntimeException("Test RuntimeException");
            newExc.initCause(e);
            throw newExc;
        }
    }
}
