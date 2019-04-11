package com.zing.utils.homework

object AddTwoNumbersSolution {

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val a = if (l1 == null) {
      new ListNode(0)
    } else {
      l1
    }
    val b = if (l2 == null) {
      new ListNode(0)
    } else {
      l2
    }
    var num = a._x + b._x
    var inc = 0
    if (num > 9) {
      inc = num / 10
      num = num % 10
    }
    val data = new ListNode(num)
    if (inc > 0) {
      data.next = addTwoNumbers(new ListNode(inc), addTwoNumbers(l1.next, l2.next))
    } else if (a.next != null || b.next != null) {
      data.next = addTwoNumbers(a.next, b.next)
    }
    data

  }


  def main(args: Array[String]): Unit = {
    val a = new ListNode(9)
    a.next = new ListNode(9)
    a.next.next = new ListNode(9)
    a.next.next.next = new ListNode(9)
    a.next.next.next.next = new ListNode(9)

    val b = new ListNode(5)
    b.next = new ListNode(6)

    val data = addTwoNumbers(a, b)

    printListNode(a)
    printListNode(b)
    printListNode(data)

  }

  def printListNode(node: ListNode) = {
    var data = node
    while (data != null) {
      print(data._x)
      data = data.next
    }
    println("\n")
  }

}


class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}