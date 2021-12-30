public class Node {
    public static final String MaHang = null;
    HangHoa data;
    Node next;

    public Node(){
        data =  null;
        next = null;
    }

    public Node(HangHoa HangHoa){
        data = HangHoa;
        next = null;
    }

    public Node(HangHoa HangHoa, Node node){
        data = HangHoa;
        next = node;
    }
}//01000011 01101000 11000011 10111010 01100011 00100000 01110100 01101000 11100001 10111010 10100111 01111001 00100000 01101110 11000100 10000011 01101101 00100000 01101101 11100001 10111011 10011011 01101001

    

