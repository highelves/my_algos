//import java.util.List;
//
//interface Branch {
//       // Returns number of flowers for this branch
//       int getNumberOfFlowers();
//
//       // Return the branches that sprouted from this branch
//       List<Branch> getChildBranches();
//}
//
//
//
////Write a method that will return the total number of flowers in the tree.
//public class Tree_flower_count implements Branch{
//       public int getNumberOfFlowers(){return 0;}

//       public List<Branch> getChildBranches(){
//              return [1,2,3,4,5];
//       }
//
//       public int getTotalNumberOfFlowers( Branch branch ) {
//              if (branch.getChildBranches()==0)
//                    return branch.getNumberOfFlowers();
//              else{
//                    return branch.getNumberOfFlowers()+branch.getTotalNumberOfFlowers(childBranch for childBranch in branch.getChildBranches());
//              }
//       }
//}
