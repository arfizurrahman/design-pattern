using System;
using System.IO;
using System.Net.Sockets;
using System.Runtime.Serialization.Formatters.Binary;
using System.Xml.Serialization;

namespace Prototype
{
    public interface IPrototype<T>
    {
        T DeepCopy();
    }

    public static class ExtensionMethods
    {
        public static T DeepCopy<T>(this T self)
        {
            var stream = new MemoryStream();
            var formatter = new BinaryFormatter();
            formatter.Serialize(stream, self);

            stream.Seek(0, SeekOrigin.Begin);
            object copy = formatter.Deserialize(stream);
            stream.Close();
            return (T) copy;
        }

        public static T DeepCopyXml<T>(this T self)
        {
            using (var ms = new MemoryStream())
            {
                var s = new XmlSerializer(typeof(T));
                s.Serialize(ms, self);
                ms.Position = 0;
                return (T) s.Deserialize(ms);
            }
        }
    }

    public class Person 
    {
        public string[] names;
        public Address address;

        public Person()
        {
            
        }
        public Person(string[] names, Address address)
        {
            this.names = names;
            this.address = address;
        }

        //public Person DeepCopy()
        //{
        //    return new Person(names, address.DeepCopy());
        //}

        public override string ToString()
        {
            return $"{nameof(names)}: {string.Join(" ",names)}, {nameof(address)}: {address}";
        }

        //public Person(Person other)
        //{
        //    names = other.names;
        //    address = new Address(other.address);
        //}
    }

    public class Address
    {
        public string streetName;
        public int houseNumber;

        public Address()
        {
            
        }
        public Address(string streetName, int houseNumber)
        {
            this.streetName = streetName;
            this.houseNumber = houseNumber;
        }

        public Address(Address other)
        {
            streetName = other.streetName;
            houseNumber = other.houseNumber;
        }

        //public Address DeepCopy()
        //{
        //    return new Address(streetName, houseNumber);
        //}

        public override string ToString()
        {
            return $"{nameof(streetName)}: {streetName}, {nameof(houseNumber)}: {houseNumber}";
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            var jhon = new Person(new [] {"Jhon", "Smith"},
                new Address("Sayed Sha Road", 123));
            var jane = jhon.DeepCopyXml();
            jane.names[0] = "Jane";
            jane.address.houseNumber = 321;
            Console.WriteLine(jhon);
            Console.WriteLine(jane);
        }
    }
}
