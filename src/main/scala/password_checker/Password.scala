package password_checker

object Password {
  def isValid(password : String) =
    if password.length() < 6 then
      false
    else
      var containsNum: Boolean = false
      for char <- password do
        if char.toInt > 47 && char.toInt < 58 then
          containsNum = true
      containsNum

}
