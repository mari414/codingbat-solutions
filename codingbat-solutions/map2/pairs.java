public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap();
  for (String s:strings) {
    map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
  }
  return map;
}
