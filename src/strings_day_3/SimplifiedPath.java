package strings_day_3;
/*
Given an absolute path for a Unix-style file system, which begins with a slash '/',
transform this path into its simplified canonical path.

In Unix-style file system context, a single period '.' signifies the current directory,
 a double period ".." denotes moving up one directory level, and multiple slashes such as
 "//" are interpreted as a single slash. In this problem, treat sequences of periods not
 covered by the previous rules (like "...") as valid names for files or directories.

The simplified canonical path should adhere to the following rules:

It must start with a single slash '/'.
Directories within the path should be separated by only one slash '/'.
It should not end with a slash '/', unless it's the root directory.
It should exclude any single or double periods used to denote current or parent directories.
Return the new path.

 */



import java.util.*;
public class SimplifiedPath {

    public String simplifyPath(String path) {
        Stack<String>stack=new Stack<>();
        String[]components=path.split("/");

        for(String component:components){
            if(component.equals("") || component.equals(".")){
                continue;
            } else if (component.equals("..")) {
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.push(component);
            }
        }
        StringBuilder sb=new StringBuilder();
        for (String dir: stack){
            sb.append("/").append(dir);
        }
        return sb.length()>0?sb.toString():"/";
    }

    public static void main(String[] args) {

    }
}
