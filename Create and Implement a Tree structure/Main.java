class Node:
  def __init__(self, data):
    self.left = None
    self.right = None
    self.data = data
    
  def inorderPrintTree(self):
    if self.left:
      self.left.inorderPrintTree()
    print(self.data, end = " ")
    if self.right:
      self.right.inorderPrintTree()
      
  def preorderPrintTree(self):
    print(self.data, end = " ")
    if self.left:
      self.left.preorderPrintTree()
    if self.right:
      self.right.preorderPrintTree()
      
  def postorderPrintTree(self):
    if self.left:
      self.left.postorderPrintTree()
    if self.right:
      self.right.postorderPrintTree()
    print(self.data, end = " ")  
  
  
  def insert(self, data):
    if self.data:
      if data < self.data:
        if self.left is None:
          self.left = Node(data)
        else:
          self.left.insert(data)
      elif data > self.data:
        if self.right is None:
          self.right = Node(data)
        else:
          self.right.insert(data)
    else:
      self.data = data
      
      
      
n = int(input())
nodesVal = list(map(int,input().split()))
root = Node(nodesVal[0])
for i in nodesVal[1:]:
  root.insert(i)
root.inorderPrintTree() 
print()
root.preorderPrintTree()
print()
root.postorderPrintTree()
print()
  
  
  
          