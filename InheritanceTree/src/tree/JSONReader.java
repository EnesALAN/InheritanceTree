/*
    Author: Enes ALAN

    Date : 08.05.2017

    Number :013356

    Reading from Json File and set to the inheritance.


 */
package tree;

import org.json.simple.*;

import java.io.*;
import java.util.*;

public class JSONReader {
    /*class parent{

    }
    class child{

    }*/
    // You may add new methods and fields to this class
    // as long as you do not change the signature of the 'parseTreeFrom' method.

    public Tree parseTreeFrom(String fileName) throws Exception {
        FileReader fileReader = new FileReader(fileName);
        JSONObject jsonObject = (JSONObject) JSONValue.parse(fileReader);
        JSONArray relations = (JSONArray) jsonObject.get("relations");

        String allParents[] = new String[relations.size()];
        String allChildren[] = new String[relations.size()];
        for (int i = 0; i < relations.size(); i++) {
            JSONObject firstElement = (JSONObject) relations.get(i);
            String parent = (String) firstElement.get("parent");
            String child = (String) firstElement.get("child");
            allParents[i] = parent;
            allChildren[i] = child;
            System.out.println("{\"parent\":" + allParents[i] + ",\"child\":" + allChildren[i] + "}");
            Node newNode = new Node(allParents[0]);
            Node newNode2 = new Node(allChildren[0]);
            newNode.addChild(newNode2);
            Tree newTree = new Tree(newNode);

            Node newNode3 = new Node(allParents[1]);
            Node newNode4 = new Node(allChildren[1]);
            newNode3.addChild(newNode4);
            Tree newTree1 = new Tree(newNode3);

            Node newNode5 = new Node(allParents[2]);
            Node newNode6 = new Node(allChildren[2]);
            newNode5.addChild(newNode6);
            Tree newTree2 = new Tree(newNode5);

            Node newNode7 = new Node(allParents[3]);
            Node newNode8 = new Node(allChildren[3]);
            newNode7.addChild(newNode8);
            Tree newTree3 = new Tree(newNode7);
        }






       /*   JSONObject element = (JSONObject)relations.get(i);
            Node newNode = new Node(allChildrens[0]);
            newNode.setParent(element.get("parent"));
            System.out.println("{\"parent\":" + allParents[10] + ",\"child\":" + allChildrens[10]+"}");
            for (int x=0; x< allParents.size(); x++) {
            System.out.println("{\"parent\":" + allParents[x] + ",\"child\":" + allChildrens[x]+"}");
        */


        return null;
    }
}
