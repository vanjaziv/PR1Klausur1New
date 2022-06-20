package at.campus02.iwi.hiking;

public class Hiking {

    public char[][] environment = {
            {'0', '0', '0', 'H', '0', '0', '0', '0', 'L', '0'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', 'H', '0', '0', 'H', 'H'},
            {'H', '0', '0', '0', '0', '0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', '0', 'H'},
            {'0', '0', '0', 'H', 'H', '0', '0', 'L', '0', '0'},
            {'0', '0', '0', '0', '0', '0', '0', '0', 'H', '0'},
            {'L', '0', '0', 'H', '0', '0', '0', '0', '0', '0'},

    };

    public void print() {
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                System.out.format("%c\t", environment[i][j]);
            }
            System.out.println();
        }
    }

    public int totalNrObstacles(char enemyType) {
        int sum = 0;
        for (int i = 0; i < environment.length; i++) {
            for (int j = 0; j < environment[i].length; j++) {
                if (environment[i][j] == enemyType) {
                    sum = sum + 1;
                }
            }
        }
        return sum;
    }

    public int[] countObstaclesPerRow(int row) {

        int[] result = new int[2];

        for (int i = 0; i < environment[row].length; i++) {
            if (environment[row][i] == 'H') {
                result[0] += 1;
            }
            if (environment[row][i] == 'L') {
                result[1] += 1;
            }
        }
        return result;
    }

    public int energyNeededInRow(int row) {
        int points = 0;
        for (int i = 0; i < environment[row].length; i++) {
            if (environment[row][i] == 'H') {
                points += 2;
            } else if (environment[row][i] == 'L') {
                return -1;
            }
        }

        return points;
    }


    public int ableToFinishHiking(int points) {
        int rowCount = 0;

        for (int i = 0; i < environment.length; i++) {
            if ((points >= energyNeededInRow(i)) && (energyNeededInRow(i)) != -1) {
                rowCount++;
            }
        }
        return rowCount;
    }
}