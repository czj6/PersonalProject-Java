import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Lib {

    //读取输入文件
    public static Reader openInputFile(String fileName) {
        File file = new File(fileName);
        Reader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在");
        }
        return reader;
    }

    //获得输出流
    public static BufferedWriter openOutputFile(String fileName) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(fileName),true),"utf-8"));
        return bw;
    }

    //判断有效字符（A-Z,a-z,0-9）
    public static boolean isValidChar(int temp) {
        if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z') || (temp >= '0' && temp <= '9')) {
            return true;
        } else {
            return false;
        }
    }

    //判断是否为数字
    public static boolean isNum(int temp) {
        if (temp >= '0' && temp <= '9') {
            return true;
        } else {
            return false;
        }
    }

    //判断是否为有效的单词
    public static boolean isValidWord(char[] chars) {
        if (chars.length >= 4 && !isNum(chars[0]) && !isNum(chars[1]) && !isNum(chars[2]) && !isNum(chars[3])) {
            return true;
        } else {
            return false;
        }
    }

    //统计字符数,输出到对应output文件
    public static int charactersCount(String inputFile, String outputFile) throws IOException {
        Reader reader = openInputFile(inputFile);
        Writer writer = new FileWriter(outputFile);
        int num = 0,temp=0;
        while ((temp = reader.read()) != -1) {
            num++;
        }
        writer.write("characters: " + num + '\n');
        writer.close();
        reader.close();
        return num;
    }

    //统计单词总数,至少以4个英文字母开头，跟上字母数字符号，单词以分隔符分割，不区分大小写
    public static int wordsCount(String inputFile, String outputFile) throws IOException {

    }

    //统计行数(任何包含非空白字符的行)
    public static int linesCount(String inputFile, String outputFile) throws IOException {
        Reader reader = openInputFile(inputFile);
        Writer writer = openOutputFile(outputFile);
        int num = 0,temp=0;
        String line = "";
        while ((temp = reader.read()) != -1) {
            while (temp != -1 && (char) temp != '\n') {
                if ((char) temp != ' ' && (char) temp != '\t' && (char) temp != '\r') {
                    line += (char) temp;
                }
                temp = reader.read();
            }
            if (line != "") {
                num++;
            }
            line = "";
        }
        writer.append("lines: " + num + "\n");
        reader.close();
        writer.close();
        return num;
    }

    //统计单词的出现次数,最终只输出频率最高的10个。
    public static Map wordNum(String inputFile, String outputFile) throws IOException {

    }

    //打印出频率前十的单词
    public static void printWords(Map<String, Integer> map, Writer writer) throws IOException {
    }



}
