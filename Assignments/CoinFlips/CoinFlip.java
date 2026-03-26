package Assignments.CoinFlips;/*
	Objective of the program is to flip a coin and display the results of how many heads and tails and the longest run of heads and tails.
	Paven Rai 991627967
	Satyendra Narayan
	Assignment 04 Assignments.CoinFlip.CoinFlip
	Due: 04/12/2020
*/

/**
 * @author Paven Rai
 * @version 1.0
 */

public class CoinFlip //header line of class
{//start of class

    private static boolean flipResults[][]= new boolean[10][10];//creates new boolean array that holds 100 values
	/**
	 * Displays the results of the coin flip
	 * Calculates and displays the number of heads and tails in the coin flip
	 * Calculates and displays the value of the longest run of heads and tails in the coin flip
	 *
	 * @return no return from void
	 */
            public static void display()//header line of display method
            {//start of display method
				int headNumber=0, longestHeadRun=0, tempHeadCounter=0;//initialises int headNumber, longestHeadRun and tempHeadCounter
				int tailNumber=0, longestTailRun=0, tempTailCounter=0;//initialises int tailNumber, longestTailRun and tempTailCounter

				for(int i=0;i<flipResults.length;i++)//loop will run as long as i is less than the length of the flipResults array
				{//start of for loop
				for(int j=0;j<flipResults[i].length;j++)//loop will run as long as j is less than the length of the flipResults[i] array
				{//start of for loop
					if(flipResults[i][j]==true)//if the index number in the array has the value true stored
					{//start of if condition
						System.out.print("Heads ");//displays heads

						headNumber++;//adds 1 to the headNumberCounter value
						tempHeadCounter++;//adds 1 to the tempHeadCounter value
						if(tempHeadCounter> longestHeadRun)//if the tempHeadCounter value is bigger than the longestHeadRun value
						{//start of if condition
							longestHeadRun=tempHeadCounter;//the value of longestHeadRun becomes the same as the tempHeadCounter value
						}//end of if condition
						tempTailCounter=0;//resets tempTailCounter to 0
					}//end of if condition
					else//if the index number in the array has the value false stored
					{//start of else
						System.out.print("Tails ");//displays tails

						tailNumber++;//adds 1 to tailNumberCounter value
						tempTailCounter++;//adds 1 to the tempTailCounter value
						if(tempTailCounter>longestTailRun)//if the tempTailCounter value is bigger than the longestTailRun value
						{//start of if condition
							longestTailRun=tempTailCounter;//the value of longestTailRun becomes the same as the tempTailCounter value
						}//end of if condition
						tempHeadCounter=0;//resets tempHeadCounter to 0
					}//end of else
				}//end of for loop
				System.out.println();
				}//end of for (when i becomes equal to the length of the flipResults array
				System.out.println("\n\nHeads: " + headNumber);//displays the number of heads from the coin flip
				System.out.println("Tails: " + tailNumber);//displays the number of tails from the coin flip
				System.out.println("Longest heads run: " + longestHeadRun);//displays the result of the longest heads run from the coin flip
				System.out.println("Longest tails run: " + longestTailRun);//displays the result of the longest tails run from the coin flip
            }//end of display method
	/**
	 * Flips coin using Math.random() to see if headsResult is true
	 * Uses store() method to store headsResult, int i and int j each loop
	 *
	 * @return no return from void
	 */
            public static void flipIt()//header line of flipIt method
            {//start of flipIt method
				boolean headsResult;//declares boolean variable with the name headResults
				int i=0;
                while(i<flipResults.length)//while loop runs until the value of int i is equal to the length of flipResults array
                {//end of for loop
                for(int j=0;j<flipResults[i].length;j++)
                {
                    double num = Math.random();//declares double variable called num which has a value from 0.0 to 1.0 using Math.random method
                    if (num > 0.5)//if the value of num is more than 0.5
                    {//start of if condition
                        headsResult = true;//headResults is given the value true
                    }//end of if condition
                    else //if the value of num is less than 0.5
                    {//start of else
                        headsResult = false;//headResults is given the value false
                    }//end of else
                    store(i,j, headsResult);//calls the store method to store int i (row number), int j (column number) and the headResult value from each loop
			}//end of for loop
			i++;//adds 1 to the value of i each loop
                }//end of while loop (when the value int i is equal to the value of the length of the flipResults array)
            }//end of flipIt method

	/**
	 * Stores coin flip results from the flipIt method()
	 * Places and stores the results in the index number from the flipIt() method
	 *
	 * @param row - type is int, row number from the flipIt() method, used for storing the correct result in the array
	 * @param column - type is int, column number from the flipIt() method, used for storing the correct result in the array
	 * @param result - type is boolean, uses headResult from flipIt() method, stored in the row and column number of the array
	 *
	 * @return no return from void
	 */

            private static void store(int row,int col, boolean result)//header line for the store method with parameters int index which holds the value of i from the flipIt method and boolean results which holds the value of headResults from the flipIt method
            {//start of store method
                    flipResults[row][col] = result;//stores the result value into the index number of the flipResults array
            }//end of store method
}//end of class