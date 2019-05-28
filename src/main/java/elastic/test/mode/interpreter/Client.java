package elastic.test.mode.interpreter;

/**
 * 	开发一套机器人控制程序，在该机器人控制程序中包含一些简单的英文控制指令，
 * 	每一个指令对应一个表达式(expression)，该表达式可以是简单表达式也可以是复合表达式，
 * 	每一个简单表达式由移动方向(direction)，移动方式(action)和移动距离(distance)三部分组成，
 * 	其中移动方向包括上(up)、下(down)、左(left)、右(right)；移动方式包括移动(move)和快速移动(run)；
 * 	移动距离为一个正整数。两个表达式之间可以通过与(and)连接，形成复合(composite)表达式。
 * 	用户通过对图形化的设置界面进行操作可以创建一个机器人控制指令，
 * 	机器人在收到指令后将按照指令的设置进行移动，
 * 	例如输入控制指令：up move 5，则“向上移动5个单位”；
 * 	输入控制指令：down  run 10 and left move 20，则“向下快速移动10个单位再向左移动20个单位”
 * 
 * 	文法规则如下：符号“::=”表示“定义为”的意思，
 * 	其左边的语言单位通过右边来进行说明和定义，语言单位对应终结符表达式和非终结符表达式
 * expression ::= direction action distance | composite //表达式
 * composite ::= expression 'and' expression //复合表达式
 * direction ::= 'up' | 'down' | 'left' | 'right' //移动方向
 * action ::= 'move' | 'run' //移动方式
 * distance ::= an integer //移动距离
 * 
 * 	每个文法规则的语言实例都可以表示为一个抽象语法树
 * 
 * 	解释器模式
 * @author jinyang
 *
 */
public class Client {

	public static void main(String[] args) {
		String instruction = "up move 5 and down run 10 and left move 5";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		String outString;
		outString = handler.output();
		System.out.println(outString);
	}
	
}
