public String withoutString(String base, String remove) {
  
  if(base.length() < remove.length())
    return base;
  if(base.substring(0, remove.length()).toLowerCase().equals(remove.toLowerCase()))
    return withoutString(base.substring(remove.length()), remove);
  return base.charAt(0) + withoutString(base.substring(1), remove);
}
