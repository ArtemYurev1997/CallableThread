package by.pvt.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CallableClass callableClass1 = new CallableClass("1");
        CallableClass callableClass2 = new CallableClass("2");
        CallableClass callableClass3 = new CallableClass("3");
        CallableClass callableClass4 = new CallableClass("4");
        CallableClass callableClass5 = new CallableClass("5");
        CallableClass callableClass6 = new CallableClass("6");
        CallableClass callableClass7 = new CallableClass("7");
        CallableClass callableClass8 = new CallableClass("8");
        CallableClass callableClass9 = new CallableClass("9");
        CallableClass callableClass10 = new CallableClass("10");

        Future<List<Integer>> future1 = executorService.submit(callableClass1);
        Future<List<Integer>> future2 = executorService.submit(callableClass2);
        Future<List<Integer>> future3 = executorService.submit(callableClass3);
        Future<List<Integer>> future4 = executorService.submit(callableClass4);
        Future<List<Integer>> future5 = executorService.submit(callableClass5);
        Future<List<Integer>> future6 = executorService.submit(callableClass6);
        Future<List<Integer>> future7 = executorService.submit(callableClass7);
        Future<List<Integer>> future8 = executorService.submit(callableClass8);
        Future<List<Integer>> future9 = executorService.submit(callableClass9);
        Future<List<Integer>> future10 = executorService.submit(callableClass10);

        try{
            List<Integer> list1 = future1.get();
            List<Integer> list2 =future2.get();
            List<Integer> list3 = future3.get();
            List<Integer> list4 = future4.get();
            List<Integer> list5 = future5.get();
            List<Integer> list6 = future6.get();
            List<Integer> list7 = future7.get();
            List<Integer> list8 = future8.get();
            List<Integer> list9 = future9.get();
            List<Integer> list10 = future10.get();
            System.out.println(list1);
            System.out.println(list2);
            System.out.println(list3);
            System.out.println(list4);
            System.out.println(list5);
            System.out.println(list6);
            System.out.println(list7);
            System.out.println(list8);
            System.out.println(list9);
            System.out.println(list10);

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

    }
}
