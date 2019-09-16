package tk.xiezw.siwuxie.common.util;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.dfa.WordTree;

import java.util.Collection;

/**
 * @author xiezw
 * @date 2019/9/10
 */
public class Sensitive {

    private static WordTree wordTree = new WordTree();

    static {
        FileReader fileReader = new FileReader("file/txt/sensitive.txt");
        Collection<String> words = fileReader.readLines();
        wordTree.addWords(words);
    }

    public static boolean isMatch(String text) {
        return wordTree.isMatch(text);
    }

}
