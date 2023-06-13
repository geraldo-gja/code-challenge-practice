#Welcome to Luxoft coding challange

#Problem description 
We have a file system [FileSystem](src/main/java/luxoft/codingchallange/filesystem/FileSystem.java) that contains [files](src/main/java/luxoft/codingchallange/filesystem/File.java) in the form of the matrix. Each of these files 
have the following 4 attributes:
* size;
* name;
* timeCreated;
* permission;

# Requirements 

* Implement a way to search in your file system based on any combination of attributes
   * eg: all files that have Permission W and created before 18-05-2022
   * eg2: all files with name containg "asd"
    

* The filesystem matrix has to be traversed in reversed diagonal ( ⬋ ) :

  * eg for matrix : 

    | 1 | 2 | 3 |
    |---|---|---|
    | 4 | 5 | 6 |
    | 7 | 8 | 9 |


  the traversal should be : `[1 2 4 3 5 7 6 8 9]`
  
* Treat this coding challenge like a production task that you would implement on a daily basis