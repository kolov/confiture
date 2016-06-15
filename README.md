# confiture

A simple configuration library looking up configuration values from a list of sources

## Usage

Currently, the list conists of:
 - https://github.com/weavejester/environ
 - etcd to localhost:4001
 
The list is an atoma and can be changed by the application:

    (swap! sources conj #(str "default-" %))

## License

Copyright © 2016 FIXME

Distributed under the MIT License.
# confiture
