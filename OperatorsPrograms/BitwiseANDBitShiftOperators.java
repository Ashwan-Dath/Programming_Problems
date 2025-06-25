package Programming_Problems.OperatorsPrograms;

public class BitwiseANDBitShiftOperators
{

	public static void main(String[] args) {
		Easy();
	}

	public static void Easy() {

		// 1. '~' Unary bitwise complement
		int a = 5; // 5 in binary: 0000000000000101
		int resulta = ~a; // Inverts the bits: 1111111111111010
		System.out.println("Value of a is => " + resulta); // Output: -6
		// Here the '~' will convert the value into the binary form 5 = 00000000000000000000000000000101 ( 32 bit)
		// if  we assign the '~' operator it will inverse the binary form (like it will make two's compliment)


		// 2. '<<' Signed left shift
		int b = 3; // 3 in binary: 0000000000000011
		int resultb = b << 2; // Shift left by 2 positions: 0000000000001100
		System.out.println("Value of b is => " + resultb); // Output: 12
		// Here the '<<' operator will add two zero's to the rightmost side of the binary form of the value.
		// here 3 = 00000000000011 after applying '<<' operator it will add two zeros to the right side => 0000000000001100

		// 3. '>>' Signed right shift
		int c = 16; // 16 in binary: 0000000000010000
		int resultc = c >> 2; // Shift right by 2 positions: 0000000000000100
		System.out.println("Value of c is => " + resultc); // Output: 4
		// Here the '>>' operator will remove the two zero's from the rightmost side of the binary for of the value
		// 16 = 0000000000010000 , remove two zero's => 0000000000000100

		// 4. '>>>' Unsigned right shift
		int d = -16; // -16 in binary (two's complement): 1111111111110000
		int resultd = d >>> 2; // Shift right by 2 positions: 0011111111111100
		System.out.println("Value of d is => " + resultd); // Output: 1073741821
		// Here the '>>>' operator will add the two zero's to the leftmost side of the binary form of the value

		// 5. '&' Bitwise AND
		int e = 5;  // 5 in binary: 0000000000000101
		int f = 3;  // 3 in binary: 0000000000000011
		int resultef = e & f; // Perform bitwise AND: 0000000000000001
		System.out.println("Value of resultef is => " +resultef); // Output: 1
		// Here the '&' operator will be doing the work like '&&' operator but it applies to the bits
		//   5 = 0000000000000101
		//   3 = 0000000000000011
		//  -----------------------
		//    => 0000000000000001  : here if both the bits are 1 then only it will return 1 just like the && operator

		// 6. '|' Bitwise inclusive OR
		int g = 5;  // 5 in binary: 0000000000000101
		int h = 3;  // 3 in binary: 0000000000000011
		int resultgh = g | h; // Perform bitwise OR: 0000000000000111
		System.out.println("Value of resultgh is => " +resultgh); // Output: 7
		// Here the '|' operator will be doing the work like the '||' operator but it applies to the bits.
		//  5 =  0000000000000101
		//  3 =  0000000000000011
		// ------------------------
		//  =>   0000000000000111  : here if any of the bit is 1 then the bit will be 1 and at last all are added and results in Output


		// 7. '^' Bitwise exclusive OR
		int i = 5;  // 5 in binary: 0000000000000101
		int j = 3;  // 3 in binary: 0000000000000011
		int resultij = i ^ j; // Perform bitwise XOR: 0000000000000110
		System.out.println("Value of resultij is => " +resultij); // Output: 6
		// Here the '^' operator will do the opposite like the | operator
		//  5 = 0000000000000101
		//  3 = 0000000000000011
		// -------------------------
		//  =>  0000000000000110  : in this only one of the two comparing bits are to be 1 then only it is considered as 1

	}


}
