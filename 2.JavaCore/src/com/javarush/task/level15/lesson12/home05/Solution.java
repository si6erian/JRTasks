package com.javarush.task.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(Object o1) {
    }
    public Solution(String s1) {
    }
    public Solution(Integer i1) {
    }

    protected Solution(Double d){
    }
    protected Solution(Float f){
    }
    protected Solution(long l){
    }

    private Solution(int iii) {
    }
    private Solution(char c) {
    }
    private Solution(boolean b) {
    }

    Solution(Exception e){
    }
    Solution(Character cc){
    }
    Solution(Short ss){
    }
}

