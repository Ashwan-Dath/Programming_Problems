int startingRange = scan.nextInt();
int endingRange = scan.nextInt();


// Calculate the direction of the loop (forward or backward) 
int step = (startingRange < endingRange) ? 1 : -1;  
// Why only storing 1 or -1 is for making the loop to iterate forward(++) or backward(--)

// A single for loop to handle both cases 
for (int i = startingRange; (step == 1) ? i <= endingRange : i >= endingRange; i += step) {
    
    System.out.print( (i < 0 ? "(" + (5 * i) + ")" : (5 * i))   +   (i != endingRange ? ", " : "") );
    //                              |                                           |
    // Print the value of i * 5, handling negative numbers with parentheses     |
    //                                                                          |
    //                                             Print a comma and space unless it's the last number

}

// This logic is for a single loop for both ranges from low to high and high to low