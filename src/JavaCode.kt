class JavaCode {
    fun toJSON(collection: Collection<Int>): String {
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }
}

//public class JavaCode {
//    public String toJSON(Collection<Integer> collection) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("[");
//        Iterator<Integer> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            sb.append(element);
//            if (iterator.hasNext()) {
//                sb.append(", ");
//            }
//        }
//        sb.append("]");
//        return sb.toString();
//    }
//}
