class Solution {
    public String simplifyPath(String fullPath) {
        Stack<String> pathStack = new Stack<>();
        String[] pathSplitList = fullPath.split("/");

        for(String path: pathSplitList) {
            if(path.equals("") || path.equals(".")) {
                continue;
            }
            else if(path.equals("..")) {
                if(!pathStack.isEmpty())
                    pathStack.pop();
            }
            else {
                pathStack.add(path);
            }
        }

        return "/" + String.join("/", pathStack);
    }
}