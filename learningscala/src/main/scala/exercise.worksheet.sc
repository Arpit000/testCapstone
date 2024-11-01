def fn(): Unit = {
  println("Hello World")
}
fn()

def add(x: Int, y: Int): Int = {
  if (x == y) (x + y) * 3 else x + y
}
add(3, 3)
