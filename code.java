//MIT License
//Copyright (c) 2020 linuxbckp

import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.lang.Exception;
//use Jdk 13

/***  今日幸运数字
*     今日幸運數字
*     lucky number today
*     github.com/linuxbckp
* @author linuxbckp
* @version 1.0
* @return void
*/

public class code{
	public static void main(String args[]){
		//指定种子数字
		//指定種子數字
		//assign seed number
		Random r1 = new Random('l');
		Random r2 = new Random('u');
		Random r3 = new Random('c');
		Random r4 = new Random('k');
		Random r5 = new Random('y');
		LocalDate date = LocalDate.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
        String dS = date.format(format);
        int dSN = Integer.parseInt(dS);
        //指定日期种子数字
		//指定日期種子數字
		//assign date seed number
        Random r6 = new Random(dSN);
        //计算今日幸运数字
        //計算今日幸運數字
        //calculate lucky number today
		int result = (r1.nextInt('l')+r2.nextInt('u')+r3.nextInt('c')+r4.nextInt('k')+r5.nextInt('y')+r6.nextInt('!'))%10;
		System.out.println("lucky number today: "+result);
		System.out.println("date: "+dS);
		File file = new File("./",dS+".txt");
		try{file.createNewFile();
			}catch(Exception e)
			{e.printStackTrace();
				}
		//寫入文件
		//写入文件
		//write into a file
		try{FileWriter writer = new FileWriter(file);
			writer.write("lucky number today: "+result+", "+"date: "+dS);		
			writer.flush();
			writer.close();
			}catch(Exception e){
			e.printStackTrace();
				}
		}
}
