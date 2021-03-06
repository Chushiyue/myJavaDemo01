/*
* 数据结构 --> 数组 --> 插入、删除、扩容、输出
*/
public class MyArray
{
	private int[] array;
	private int size;
	public MyArray(int length)
	{
		array = new int[length];
		size = 0;
	}

	public void insert(int num, int index)
	{
		if (index < 0 || index > size)
		{
			System.out.println("下标错误");
			return;
		}

		if (size >= array.length)
		{
			resize();
		}

		for (int i = size - 1; i >= index; i--)
		{
			array[i + 1] = array[i];
		}

		array[index] = num;
		size++;
	}

	public void out()
	{
		for (int i = 0; i < size; i++)
		{
			System.out.print(array[i] + " ");
		}
	}

	public void resize()
	{
		int[] newArr = new int[array.length * 2];
		System.arraycopy(array, 0, newArr, 0, array.length);
		array = newArr;
	}

	public int delete(int index)
	{
		if (index < 0 || index > size)
		{
			System.out.println("下标错误");
			return -1;
		}

		int delIndex = array[index];

		for (int i = index; i < size - 1; i++)
		{
			array[i] = array[i + 1];
		}

		size--;

		return delIndex;
		}

	public static void main(String[] args)
	{
		MyArray arr = new MyArray(1);
		arr.insert(12, 0);
		arr.insert(13, 0);
		arr.insert(3, 1);
		arr.insert(42, 2);
		arr.insert(14, 1);
		arr.insert(11, 2);
		arr.delete(1);
		arr.out();
	}
} // 13 11 3 42 12