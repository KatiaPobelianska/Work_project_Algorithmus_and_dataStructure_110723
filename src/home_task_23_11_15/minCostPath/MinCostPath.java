package home_task_23_11_15.minCostPath;

import java.util.Arrays;

public class MinCostPath {
    // Метод для нахождения минимальной стоимости пути
    public static int minCost(int[][] costs){

        // Получаем количество строк и столбцов в таблице
        int rows = costs.length;
        int cols = costs[0].length;

        // Создаем массив для мемоизации результатов
        int[][] memo = new int[rows][cols];

        // Инициализируем массив memo значениями -1
        for(int row[]: memo){
            Arrays.fill(row, -1);
        }

        // Вызываем рекурсивную функцию для нахождения минимальной стоимости
        return minCostRecursive(costs, rows-1,cols-1, memo);
    }

    // Рекурсивная функция с мемоизацией
    private static int minCostRecursive(int[][] costs, int row,int col, int memo[][]){
        // Базовый случай: если достигнут левый верхний угол
        if(row == 0 && col == 0){
            return costs[0][0];
        }
        // Проверяем, был ли результат для текущей клетки рассчитан ранее
        if(memo[row][col] != -1){
            return memo[row][col];
        }
        // Рекурсивно рассчитываем минимальную стоимость пути
        int fromTop = row > 0 ? minCostRecursive(costs, row - 1, col, memo) : Integer.MAX_VALUE;
        int fromLeft = col > 0 ? minCostRecursive(costs, row, col - 1, memo) : Integer.MAX_VALUE;

        // Сохраняем результат в массиве мемоизации и возвращаем его
        memo[row][col] = costs[row][col] + Math.min(fromTop, fromLeft);
        return memo[row][col];
    }

    public static void main(String[] args) {
        int [][] costs = new int[][]{
                {0,1,4,4},
                {4,1,1,1},
                {4,4,4,1},
                {4,4,4,0}
        };
        int result = minCost(costs);
        System.out.println("minCost(costs)= " + result);
    }
}
