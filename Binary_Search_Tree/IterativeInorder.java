public static void inOrderI(Node root){
		LinkedList<orderPair> stack=new LinkedList<>();
		orderPair op=new orderPair();
		op.node=root;
		stack.addFirst(op);
		while(stack.size()!=0){
			orderPair temp=stack.getFirst();
			 if(!temp.leftDone){
					if(temp.node.left!=null){
						orderPair np=new orderPair();
						np.node=temp.node.left;
						stack.addFirst(np);
						
					}
					temp.leftDone=true;
				}
			 else if(!temp.selfDone){
				System.out.print(temp.node.data+" ");
				temp.selfDone=true;
			}
			
			else if(!temp.rightDone){
				if(temp.node.right!=null){
					orderPair np=new orderPair();
					np.node=temp.node.right;
					stack.addFirst(np);
					
				}
				temp.rightDone=true;
			}
			else{
				stack.removeFirst();
			}
		}
		
	}
