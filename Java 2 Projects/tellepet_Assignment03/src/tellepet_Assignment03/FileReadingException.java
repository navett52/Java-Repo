/******************************************************
 * Evan Tellep                                        *
 * Assignment 03                                      *
 * 02/02/2016                                         *
 * IT2045C (Computer Programming 2)                   *
 * A custom exception to throw if a file can't be read*                                                   
 * Ref:                                               *
 ******************************************************/

package tellepet_Assignment03;

import java.io.FileNotFoundException;

public class FileReadingException extends FileNotFoundException {
	//The message that the exception will print
	public String Message = "There has been a problem reading the file";

}
