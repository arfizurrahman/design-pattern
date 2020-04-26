using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MonoState
{
    public class CEO
    {
        private static string name;
        private static int age;

        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public int Age
        {
            get { return age; }
            set { age = value; }
        }

        public override string ToString()
        {
            return $"{nameof(Name)}: {Name}, {nameof(Age)}: {Age}";
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            var ceo = new CEO();
            ceo.Name = "Arfiz";
            ceo.Age = 25;

            var ceo2 = new CEO();
            Console.WriteLine(ceo2);

            Console.ReadKey();
        }
    }
}
